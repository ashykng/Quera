def app():
    num = int(input())
    res = num

    for _ in range(1, num // 2 + 1):
        if num % _ == 0:
            res -= _

    if res == 0:
        print("YES")
    else:
        print("NO")


if __name__ == "__main__":
    app()