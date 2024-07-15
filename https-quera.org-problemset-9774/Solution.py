def app():
    num = input()

    for digit in num:
        print(f"{digit}: {digit * int(digit)}")


if __name__ == "__main__":
    app()