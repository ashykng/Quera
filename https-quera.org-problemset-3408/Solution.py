def app():
    input()
    string = input().split()
    string = string[::-1]
    res = " ".join(string)
    print(res)


if __name__ == "__main__":
    app()