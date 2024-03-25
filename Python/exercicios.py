# IF ELSE

# 1 

idade = int(input("Digite a sua idade: "))

if idade <= 17:
    print("Você é menor de idade")
else:
    print("Você é maior de idade")


# 2

def desconto(produto, preco, qtd):
    if qtd <= 10:
        total = preco * qtd
    elif qtd <= 20:
        total = preco * qtd * 0.9
    elif qtd <= 50:
        total = preco * qtd * 0.8
    else:
        total = preco * qtd * 0.75
    print(f"\n Produto: {produto}\n Quantidade: {qtd}\n Total da compra: {total}")


produto = input("Digite o nome do produto: ")
qtd = int(input("Digite a quantidade: "))
preco = float(input("Digite o preço: "))
calcDesc = desconto(produto, preco, qtd)


# 3
import random

def jp(p1):
    opcoes = ["pedra", "papel", "tesoura"]
    p2 = random.choice(opcoes)
    print(f"\nVocê escolheu: {p1}")
    print(f"Jogador 2 escolheu: {p2}")
    if p1 == p2:
        return "Empate!"
    elif (
            (p1 == "pedra" and p2 == "tesoura") or
            (p1 == "papel" and p2 == "pedra") or
            (p1 == "tesoura" and p2 == "papel")
    ):
        return "Você ganhou!"
    else:
        return "Você perdeu!"


# Solicitar escolha do jogador
p1 = input("Escolha: pedra, papel ou tesoura? ").lower()
# Validar escolha do jogador

if p1 in ["pedra", "papel", "tesoura"]:
    resultado = jp(p1)
    print(resultado)
else:
    print("Escolha inválida. Por favor, escolha entre pedra, papel ou tesoura.")

#FOR
# 5

numTab = int(input("Informe o número da tabuada desejada: "))

for i in range(1, 11):
    tab = numTab * i
    print(f'{numTab} x {i} = {tab}')

# 6

import random

numeros = [random.randint(0, 100) for _ in range(10)]
print(numeros)
maior = max(numeros)
menor = min(numeros)
print(f'\n Maior número: {maior}\n Menor número: {menor}')

# 7

a, b = 0, 1
seq = int(input("Informe um numero inteiro não negativo: "))

print(a, b, end=' ')
for i in range(seq):
    c = a + b
print(c, end=' ')
a = b
b = c

#WHILE/DO-WHILE

# 8

n = int(input("Digite um número: "))

while n != 10:
    print("Tente novamente")
    n = int(input("Digite um número: "))
    if n == 10:
        print("Número correto!");

# 9

n = int(input("Informe a sequencia que será exibida: "))

a, b = 0, 1
print(a, b, end=' ')
c = 0
i = 0
for i in range(n):
    while (c <= n):
        c = a + b
        if c <= n:
            print(c, end=' ')
        a = b
        b = c

#VETORES E MATRIZES
# 10

t = int(input("Digite o tamanho da matriz: "))


def matrizAleatoria(t):
    matriz = []
    for i in range(t):
        l = []
        for j in range(t):
            valor = random.randint(0, 9)
            l.append(valor)
        matriz.append(l)
    return matriz


mat = matrizAleatoria(t)
print(mat)


def somaDiagonal(mat):
    t = len(mat)
    return sum(mat[i][i] for i in range(t))


soma = somaDiagonal(mat)
print(soma)


# 11

def vetorAleatorio(n):
    num_sorteados = set()
    v = []
    while len(v) < n:
        num = random.randint(0, 500)
        if num not in num_sorteados:
            num_sorteados.add(num)
            v.append(num)
    return v


n = 100

valor_aleatorio = vetorAleatorio(n)

print(valor_aleatorio)


def bubbleSort(v):
    n = len(v)
    for i in range(n - 1):
        swapped = False
        for j in range(0, n - i - 1):
            if v[j] > v[j + 1]:
                swapped = True
                v[j], v[j + 1] = v[j + 1], v[j]
        if not swapped:
            return v
    return v


vetor_ordenado = bubbleSort(valor_aleatorio.copy())

print(vetor_ordenado)

# 11

import random

v1 = []
v2 = []


def vetoraleatorio(n):
    num_sorteados = set()
    while len(v1) < n:
        num = random.randint(0, 1000)
        if num not in num_sorteados:
            num_sorteados.add(num)
            v1.append(num)
    while len(v2) < n:
        num = random.randint(0, 1000)
        if num not in num_sorteados:
            num_sorteados.add(num)
            v2.append(num)
    return v1, v2


n = 50

va1, va2 = vetoraleatorio(n)
print("Vetor 1")
print(va1)
print("Vetor 2")
print(va2)

vcombinado = va1 + va2
print("Vetores combinados")
print(vcombinado)


def bubbleSort(vcombinado):
    n = len(vcombinado)
    for i in range(n - 1):
        swapped = False
        for j in range(0, n - i - 1):
            if vcombinado[j] > vcombinado[j + 1]:
                swapped = True
                vcombinado[j], vcombinado[j + 1] = vcombinado[j + 1], vcombinado[j]
        if not swapped:
            return vcombinado
    return vcombinado


vcombinadoordenado = bubbleSort(vcombinado)

print("Vetor combinado e ordenado")
print(vcombinadoordenado)
