def app():
    num = int(input())
    first = input()
    second = input()
    res = 0
    for index in range(num):
        if first[index] != second[index]:
            res += 1

    print(res)


if __name__ == "__main__":
    app()