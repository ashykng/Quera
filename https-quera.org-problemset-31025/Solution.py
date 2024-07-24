from math import floor
def app():
    n, k = map(int, input().split())
    for _ in range(k):
        n /= 2
    print(floor(n))


if __name__ == "__main__":
    app()