from collections import deque

def bfs(y, x):
    q = deque()
    q.append((y, x))
    graph[y][x] = '0'
    while q:
        y, x = q.popleft()
        for dy, dx in d:
            Y, X = y+dy, x+dx
            if (0 <= Y < R) and (0 <= X < C) and graph[Y][X] > '0':
                q.append((Y, X))
                graph[Y][X] = '0'

R, C = map(int, input().split())
graph = [input().split() for _ in range(R)]
d = [(-1, 0), (1, 0), (0, -1), (0, 1), (-1, -1), (-1, 1), (1, -1), (1, 1)]
cnt = 0
for i in range(R):
    for j in range(C):
        if graph[i][j] > '0':
            bfs(i, j)
            cnt += 1
print(cnt)