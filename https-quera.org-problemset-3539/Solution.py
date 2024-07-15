def app():
    num = int(input())
    while num >= 10:
        num = sum(int(digit) for digit in str(num))
    print(num)


if __name__ == "__main__":
    app()