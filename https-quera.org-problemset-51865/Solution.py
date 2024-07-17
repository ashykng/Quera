def app():
    res = int(input())
    days = int(input())

    if days == 0:
        res = 20

    elif days != 7:
        res -= days

    if res < 0:
        res = 0

    print(res)

if __name__ == "__main__":
    app()