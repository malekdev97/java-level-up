# val = """
# int value = 10;
# float price = 2;
# char type = o;
# """
# length = len(val)
# i = 0
# token = []
# keywords = ['int', 'if', 'for', 'float', 'char']
# try:
#     while (i < length):
#         token = []
#         if(val[i].isalpha() or val[i] == '_'):
#             token.append(val[i])
#             i += 1
#             while(val[i].isalnum() or val[i] == '_'):
#                 token.append(val[i])
#                 i += 1
#             value = ''.join(token)
#             if(value in keywords):
#                 print(value, end="")
#             else:
#                 print(value, end="")
#             continue
#         elif val[i].isdigit():
#             token.append(val[i])
#             i += 1
#             while(val[i].isdigit()):
#                 token.append(val[i])
#                 i += 1
#                 print("".join(token), end="")

#             continue
#         elif val[i].isspace():
#             token.append(val[i])
#             i += 1
#             while(val[i].isspace()):
#                 token.append(val[i])
#                 i += 1
#             print(''.join(token), sep='', end='')
#             continue
#         elif val[i] == '=':
#             token.append(val[i])
#             i += 1
#             print("=", end='')

#             continue
#         elif val[i] == ';':
#             token.append(val[i])
#             print(';', end='')
#         i += 1
# except:
#     print(''.join(token))

# _______________________________ #

class Token:
    def __init__(self, value, type):
        self.value = value
        self.type = type

class Tokenizer:
    def __init__(self, code: str):
        self.code = code
        self.length = len(code)
        self.position = 0
    
    def isEOC(self):
        return self.position >= self.length
    
    def read_identifier(self):
        token = []
        while not self.isEOC() and (self.code[self.position].isalnum() or self.code[self.position] == '_'):
            token.append(self.code[self.position])
            self.position += 1
        return ''.join(token)
    
    def read_number(self):
        token = []
        while not self.isEOC() and self.code[self.position].isdigit():
            token.append(self.code[self.position])
            self.position += 1
        return ''.join(token)
    
    def read_whitespace(self):
        token = []
        while not self.isEOC() and self.code[self.position].isspace():
            token.append(self.code[self.position])
            self.position += 1
        return ''.join(token)
    
    def read(self):
        if self.isEOC():
            return None
        character = self.code[self.position]
        if character == '_' or character.isalpha():
            return Token(self.read_identifier(), 'id')
        elif character.isdigit():
            return Token(self.read_number(), 'number')
        elif character.isspace():
            return Token(self.read_whitespace(), 'whitespace')
        else:
            raise ValueError("unexpected token")

# Example usage
t = Tokenizer("Python 3")
tokens_value = []
tokens_type = []
token = t.read()
while token is not None:
    tokens_value.append(token.value)
    tokens_type.append(token.type)
    token = t.read()


print(tokens_value)
print(tokens_type)
 
class Node:
    def __init__(self):
        self.key = None
        self.value = []
    
class Parser:
    def __init__(self, t):
        self.tokenizer = t
    
    def parse(self):
        nodes = []
        token = self.tokenizer.read()
        if token.type == 'id':
            n = Node()
            n.key = token.value
            
            token = self.tokenizer.read()
            if token.value == ':':
                token = self.tokenizer.read()
                if token.value.isdigit():
                    n.value = int(token.value)
                elif isinstance(token.value, str):
                    n.value = token.value
                    nodes.append(n)
            elif token.value.lower() in ['true', 'false']:
                n.value = bool(token.value)
            else:
                n.value = self.parse()
                nodes.append(n)
            
            return nodes
 