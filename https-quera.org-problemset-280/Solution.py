def app():
    num1 = int(input())
    num2 = int(input())
    num3 = int(input())
    nums = [num1, num2, num3]
    max_num = max(nums)
    nums.remove(max_num)
    res = max_num**2
    for num in nums:
        res -= num**2
    if res == 0:
        print("Yes")

    else:
        print("No")


if __name__ == "__main__":
    app()
