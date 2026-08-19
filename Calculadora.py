##CALCULADORA
print("soma: + ")
print("subtracao: - ")
print("multiplicacao: * ")
print("divisao: / ")
print("de um espaço entre os numeros e a operacao ")
print("Exemplo: 10 + 10")
a,operacao,b = input("digite a operacao que deseja fazer: ").split()
a = float(a)
b = float(b)
if operacao == "+":
    print(a+b)
elif operacao == "-":
    print(a-b)
elif operacao == "*":
    print(a*b)
elif operacao == "/":
    print(a/b)
else:
    print("operacao invalida")
