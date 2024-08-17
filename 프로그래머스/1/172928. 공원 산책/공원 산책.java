class Solution {
    public int[] solution(String[] park, String[] routes) {
        int H = park.length;
        int W = park[0].length();
        int[] position = new int[2];

        // 로봇 강아지의 초기 위치 찾기
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                if (park[i].charAt(j) == 'S') {
                    position[0] = i;
                    position[1] = j;
                    break;
                }
            }
        }

        // 명령 수행
        for (String route : routes) {
            String[] parts = route.split(" ");
            String direction = parts[0];
            int distance = Integer.parseInt(parts[1]);

            int newRow = position[0];
            int newCol = position[1];

            for (int i = 0; i < distance; i++) {
                switch (direction) {
                    case "N":
                        newRow--;
                        break;
                    case "S":
                        newRow++;
                        break;
                    case "E":
                        newCol++;
                        break;
                    case "W":
                        newCol--;
                        break;
                }

                // 공원을 벗어나거나 장애물을 만나는 경우
                if (newRow < 0 || newRow >= H || newCol < 0 || newCol >= W || park[newRow].charAt(newCol) == 'X') {
                    newRow = position[0];
                    newCol = position[1];
                    break;
                }
            }

            position[0] = newRow;
            position[1] = newCol;
        }

        return position;
    }

}