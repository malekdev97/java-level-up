
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

class Token:
    Value
    type
    
class Tokenizer:
    def __init__(self, code: str):
        self.code = code
        self.length = len(code)
        self.token = []
        self.position = -1
    
    def isEOC(self):
        return self.position >= self.length
    
    def read_identifier(self):
        if self.isEOC():
            return None
        character = self.code[self.position]
        while((not self.isEOC()) and character.isalnum() or character == '_'):
            self.token.append(character)
            self.position += 1
        
        return ''.join(self.token)
    
    def read_number(self):
        if self.isEOC():
            return None
        character = self.code[self.position]
        while((not self.isEOC()) and character.isdigit()):
            self.token.append(character)
            self.position += 1
        
        return ''.join(self.token)
    
    def read_whitespace(self):
        if self.isEOC():
            return None
        character = self.code[self.position]
        while((not self.isEOC()) and character.isspace()):
            self.token.append(character)
            self.position += 1
        
        return ''.join(self.token)
    
    def read(self):
        self.token = []
        while(not self.isEOC()):
            character = self.code[self.position]
            if character == '_' or character.isalpha():
                return self.read_identifier()
            elif character.isdigit():
                return self.read_number()
            elif character.isspace():
                return self.read_whitespace()
            else:
                raise ValueError("unexpected token")
        
        return None

class Node:
    Key
    Value = []
    
class Parser:
    def __init__(self, t):
        self.tokenizer = t
    
    def parse(self):
        nodes = []
        token = t.read()
        if token.type == 'id':
            n = Node()
            n.key = token.value
            
            token = t.read()
            if token.value == ':':
                token = t.read()
                if token.value is number:
                    n.value = int(token.value)
                elf token.value is SyntaxWarning
                    n.value = token.value
                    nodes.append(n)
            elif token.value is boolean:
                n.value = bool(token.value)
            else:
                n.value = self.parse()
                nodes.append(n)
            
            return nodes
                

# t = Tokenizer("Python 3")
# tokens = []
# token = t.read()
# while(token != None):
#     tokens.append(token)
#     token = t.read()

#     print(tokens)




        
    
    
