def app():
    num = int(input())
    res = 0

    for i in range(num):
        res += i + 1

    print(res)


if __name__ == "__main__":
    app()