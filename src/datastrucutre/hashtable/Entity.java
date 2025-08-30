package hashtable;

class Entry {
    public String key;
    public String value;
    public int rawHash;

    public Entry(String key, String value) {
        this.key = key;
        this.value = value;
        this.rawHash = rawHash(key);
    }

    public static int rawHash(String key) {
        int hashKeyValue = 0;

        for (int i = 0; i < key.length(); i++) {
            int charCode = key.charAt(i) - 96;
            hashKeyValue = hashKeyValue * 27 + charCode;
        }

        System.out.println("Key: "+key+" RAW HASH : "+hashKeyValue+"\n");
        return hashKeyValue;
    }

    public String toString() {
        return " { Key : "+this.key+" -> Value : "+this.value+" } ";
    }

}
