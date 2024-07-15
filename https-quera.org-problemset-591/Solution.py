def app():
    num = int(input())
    first_last = "*" * num

    print(first_last)
    for _ in range(num - 2):
        print(f"*{' ' * (num - 2)}*")
    print(first_last)

if __name__ == "__main__":
    app()