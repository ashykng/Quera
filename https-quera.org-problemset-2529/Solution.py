def app():
    res = 0
    for _ in range(int(input())):
        user_input = input()
        max_letters = len(set(user_input))
        if res <= max_letters:
            res = max_letters

    print(res)


if __name__ == "__main__":
    app()