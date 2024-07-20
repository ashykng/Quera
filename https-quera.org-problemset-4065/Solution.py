def app():
    a, b, l = map(int, input().split())
    res = 0

    for i in range(1, l + 1):
        if i % 2 == 1:
            res += a
        else:
            res += b

    print(res)


if __name__ == "__main__":
    app()