# f"{bmi:.2f}"

def app():
    n1 = int(input())
    n2 = int(input())
    n3 = int(input())
    n4 = int(input())
    sm = n1 + n2 + n3 + n4
    product = n1 * n2 * n3 * n4
    average = sm / 4
    mx = max((n1, n2, n3, n4))
    mn = min((n1, n2, n3, n4))
    print(f"Sum : {sm:.6f}")
    print(f"Average : {average:.6f}")
    print(f"Product : {product:.6f}")
    print(f"MAX : {mx:.6f}")
    print(f"MIN : {mn:.6f}")



if __name__ == "__main__":
    app()