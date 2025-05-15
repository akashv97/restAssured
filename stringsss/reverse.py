# Online Python compiler (interpreter) to run Python online.
# Write Python 3 code in this online editor and run it.
def revrstr(s):
    letters=[c for c in name if c.isalpha()]
    result=[]
    for char in name:  
      if char.isalpha(): 
        result.append(letters.pop()) 
      else:
        result.append(char)
    return ''.join(result)  
    


name="Jyoti12!Ranj@#a%n";
op=revrstr(name)
print(op)
        
   
    