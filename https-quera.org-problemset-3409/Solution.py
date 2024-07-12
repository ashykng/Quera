def app():
    num = int(input())

    for _ in range(1, num + 1):
        for __ in range(1, num + 1):
            print(_ * __, end=" ")
        print()


if __name__ == "__main__":
    app()
