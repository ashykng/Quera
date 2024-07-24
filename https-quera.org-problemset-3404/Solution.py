def app():
    n = int(input())
    m = float(input())
    bmi = round(n / m ** 2, 2)
    print(f"{bmi:.2f}")
    if bmi < 18.5:
        print("Underweight")
    elif bmi < 25:
        print("Normal")
    elif bmi < 30:
        print("Overweight")
    else:
        print("Obese")

if __name__ == "__main__":
    app()