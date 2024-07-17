def app():
    inputs = input().split()
    n = int(inputs[0])
    string = inputs[1]
    print(f"{n * 'copy of '}{string}")


if __name__ == "__main__":
    app()