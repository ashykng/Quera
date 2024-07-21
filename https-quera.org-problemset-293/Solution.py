def app():
    first = int(input())
    second = int(input())
    for num in range(first, second + 1):
        if is_prime(num):
            print(num)

def is_prime(num):
    if num <= 1:
        return False
    if num == 2:
        return True
    if num % 2 == 0:
        return False
    for i in range(3, int(num ** 0.5) + 1, 2):
        if num % i == 0:
            return False
    return True

if __name__ == "__main__":
    app()
