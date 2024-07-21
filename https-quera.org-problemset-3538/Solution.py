def app():
    input()
    first = input().split()
    input()
    second = input().split()
    input()
    third = input().split()
    _ = first + second + third
    days = ["shanbe", "1shanbe", "2shanbe", "3shanbe", "4shanbe", "5shanbe", "jome"]

    for __ in _:
        if __ in days:
            days.remove(__)

    print(len(days))

if __name__ == "__main__":
    app()