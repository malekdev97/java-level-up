import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
class Tag {
    String tagName;
    List<String[]> attributes;
    public Tag(String tagName) {
        this.tagName = tagName;
        this.attributes = new ArrayList<>();
    }
}
class HTMLTagChecker {
    private static Stack<Tag> tagStack;
    public static void main(String[] args) {
        String filePath = "index.html";
        try {
            boolean isCorrect = readFile(filePath);
            if (isCorrect) {
                System.out.println("HTML tag nesting is correct.");
            } else {
                System.out.println("HTML tag nesting is incorrect.");
            }
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }
    private static boolean readFile(String filePath) throws IOException {
        tagStack = new Stack<>();
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        int charCode;
        StringBuilder currentTag = new StringBuilder();
        boolean insideTag = false;
        boolean insideComment = false;
        while ((charCode = reader.read()) != -1) {
            char currentChar = (char) charCode;
            if (insideComment) {
                if (currentChar == '>') {
                    insideComment = false;
                }
                continue;
            }
            if (currentChar == '<') {
                if (!insideTag) {
                    insideTag = true;
                    currentTag = new StringBuilder();
                } else {
                    // Handle nested tags, e.g., <div><span></span></div>
                    String tagString = currentTag.toString();
                    if (!tagString.startsWith("!")) {
                        Tag tag = createTag(tagString);
                        if (tag != null) {
                            tagStack.push(tag);
                        }
                    }
                    currentTag = new StringBuilder();
                }
            } else if (currentChar == '>') {
                insideTag = false;
                String tagString = currentTag.toString();
                if (tagString.startsWith("/")) {
                    // Handle closing tag
                    String closingTagName = tagString.substring(1);
                    if (!tagStack.isEmpty()) {
                        Tag topTag = tagStack.pop();
                        if (!topTag.tagName.equals(closingTagName)) {
                            // Incorrect closing tag
                            return false;
                        }
                    } else {
                        // Closing tag without corresponding open tag
                        return false;
                    }
                } else if (tagString.startsWith("!")) {
                    // Handle comment tag
                    insideComment = true;
                } else if (!tagString.endsWith("/")) {
                    // Handle non-self-closing tag
                    Tag tag = createTag(tagString);
                    if (tag != null) {
                        tagStack.push(tag);
                    }
                }
                currentTag = new StringBuilder();
            } else {
                currentTag.append(currentChar);
            }
        }
        reader.close();
        // Check if all tags are correctly nested
        return tagStack.isEmpty();
    }
    private static Tag createTag(String tag) {
        String cleanedTag = tag.trim();
        String[] parts = cleanedTag.split("\\s+");
        if (parts.length > 0) {
            String tagName = parts[0];
            List<String[]> attributes = new ArrayList<>();
            for (int i = 1; i < parts.length; i++) {
                String attrPart = parts[i];
                String[] attrParts = attrPart.split("=");
                if (attrParts.length == 2) {
                    String attrName = attrParts[0];
                    String attrValue = attrParts[1].replaceAll("\"", "");
                    attributes.add(new String[]{attrName, attrValue});
                }
            }
            return new Tag(tagName);
        }
        return null;
    }
}