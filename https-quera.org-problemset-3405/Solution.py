def app():
    num = int(input())
    nums = [num]

    while nums[-1] != 0:
        num = int(input())
        nums.append(num)

    nums = nums[::-1]
    nums = nums[1:]

    for num in nums:
        print(num)


if __name__ == "__main__":
    app()
