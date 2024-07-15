def app():
    num = int(input())
    res = 0
    while pow(2, res) <= num:
        res += 1

    print(2 ** res)


if __name__ == "__main__":
    app()