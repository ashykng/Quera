from math import sqrt

def app():
    num = int(input())
    divisor = 0
    sm = 0
    for n in range(1, num + 1):
        divisors = list(divisorGenerator(n))
        divisor += len(divisors)
        sm += sum(divisors)

    print(divisor, int(sm))



def divisorGenerator(num):
    large_divisors = []
    for i in range(1, int(sqrt(num) + 1)):
        if num % i == 0:
            yield i
            if i*i != num:
                large_divisors.append(num / i)
    for divisor in reversed(large_divisors):
        yield divisor

if __name__ == "__main__":
    app()