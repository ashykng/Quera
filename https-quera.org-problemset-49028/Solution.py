def app():
    nums = []
    res = 0
    for _ in range(int(input())):
        nums.append(int(input()))
    last = nums[0]
    for _ in nums:
        if _ != last:
            last = _
            res += 1

    print(res)


if __name__ == "__main__":
    app()