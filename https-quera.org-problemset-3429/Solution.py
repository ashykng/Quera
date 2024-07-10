def app():
    num = int(input())

    if num > 100:
        print("Steam")
    elif num < 0:
        print("Ice")
    else:
        print("Water")

if __name__ == "__main__":
    app()