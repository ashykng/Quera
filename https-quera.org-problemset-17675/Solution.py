def app():
    num = int(input())
    fibs = set(fib(num))
    for _ in range(1, num + 1):
        if _ in fibs:
            print("+", end="")
        else:
            print("-", end="")


def fib(n):
    a, b = 1, 1

    for i in range(n):
        yield a
        a, b = b, a + b


if __name__ == "__main__":
    app()