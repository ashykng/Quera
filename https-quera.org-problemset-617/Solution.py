def app():
    num = input()
    reversed_num = num[::-1]
    if num == reversed_num:
        print("YES")
    else:
        print("NO")


if __name__ == "__main__":
    app()