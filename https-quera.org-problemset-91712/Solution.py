def app():
    x1, x2 = map(int, input().split())
    distance = abs(x2 - x1)

    if x2 > x1:
        print("R" * distance)

    elif x1 > x2:
        print("L" * distance)

    else:
        print("Saal Noo Mobarak!")

if __name__ == "__main__":
    app()