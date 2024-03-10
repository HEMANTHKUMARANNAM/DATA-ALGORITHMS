import matplotlib.pyplot as plt

def visualize_path(grid, path):
    plt.imshow(grid, cmap='gray')
    for i in range(len(grid)):
        plt.axhline(i - 0.5, color='black', lw=0.5)
        plt.axvline(i - 0.5, color='black', lw=0.5)
    for i in range(len(path) - 1):
        plt.plot([path[i][1], path[i+1][1]], [path[i][0], path[i+1][0]], color='blue')
        plt.scatter([path[i][1], path[i+1][1]], [path[i][0], path[i+1][0]], color='blue')
        
    plt.scatter(path[0][1], path[0][0], color='green', label='Start')
    plt.scatter(path[-1][1], path[-1][0], color='red', label='Goal')
    # plt.legend()
    plt.title('A* Path Visualization')

    plt.show()

# Define the grid and path
grid = [
    [1, 0, 1, 1, 1, 1, 0, 1, 1, 1],
    [1, 1, 1, 0, 1, 1, 1, 0, 1, 1],
    [1, 1, 1, 0, 1, 1, 0, 1, 0, 1],
    [0, 0, 1, 0, 1, 0, 0, 0, 0, 1],
    [1, 1, 1, 0, 1, 1, 1, 0, 1, 0],
    [1, 0, 1, 1, 1, 1, 0, 1, 0, 0],
    [1, 0, 0, 0, 0, 1, 0, 0, 0, 1],
    [1, 0, 1, 1, 1, 1, 0, 1, 1, 1],
    [1, 1, 1, 0, 0, 0, 1, 0, 0, 1]
]

path = [ (8, 0), (7, 0), (6, 0), (5, 0), (4, 1), (3, 2), (2, 2), (1, 2), (0, 3), (1, 4), (1, 5), (1, 6), (2, 7), (1, 8), (0, 9)]

# Visualize the path
visualize_path(grid, path)
