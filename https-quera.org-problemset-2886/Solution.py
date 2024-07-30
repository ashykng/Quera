def app():
    h, m = map(int, input().split())
    if h != 0:
        h = 12 - h
    if m != 0:
        m = 60 - m

    print(f"{h:02}:{m:02}")

if __name__ == "__main__":
    app()