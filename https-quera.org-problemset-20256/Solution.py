def app():
    string = input()

    if (string.count("R") >= 3) or (string.count("G") == 0) or ((string.count("R") >= 2) and (string.count("Y")) >= 2):
        print("nakhor lite")

    else:
        print("rahat baash")



if __name__ == "__main__":
    app()