def fak(num):
    if num <= 1:
        return 1;
    else:
        return num * fak(num - 1)

def app():
    num = int(input())
    res = fak(num)
    print(res)


if __name__ == "__main__":
    app()