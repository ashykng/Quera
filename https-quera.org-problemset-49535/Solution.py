def app():
    n, k = map(int, input().split())
    res = 0
    for _ in range(n):
        res += int(input())

    if res >= k:
        print("YES")
    else:
        print("NO")


if __name__ == "__main__":
    app()