def app():
    res = []
    for _ in range(1, 5 + 1):
        user_input = input()
        if "HAFEZ" in user_input or "MOLANA" in user_input:
            res.append(_)
    if len(res):
        print(*res)
    else:
        print("NOT FOUND!")


if __name__ == "__main__":
    app()