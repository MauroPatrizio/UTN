# 8.	Diez equipos de la liga inter-barrial identificados con los números 1, 2, 3, 4, …, 10, participaron en un campeonato de fútbol con modalidad todos contra todos.
# Los goles anotados en cada encuentro se registraron en el siguiente cuadro:
 
# Escriba un programa que:
# o	Lea el cuadro de goles en un arreglo de dos dimensiones.
# o	Muestre para cada equipo la cantidad de triunfos, empates y derrotas.
# o	Muestre la diferencia entre el total de goles marcados y el total de goles recibidos.
# o	Determine la cantidad de puntos obtenidos por cada equipo.

goals = [
    [0, 2, 3, 0, 1, 0, 2, 0, 1, 1],
    [2, 0, 1, 1, 2, 0, 0, 2, 0, 0],
    [1, 2, 0, 2, 0, 1, 1, 0, 0, 0],
    [3, 1, 2, 0, 1, 1, 0, 1, 0, 2],
    [0, 2, 0, 2, 0, 0, 0, 1, 0, 1],
    [1, 0, 2, 1, 0, 0, 0, 0, 2, 0],
    [2, 0, 1, 0, 0, 0, 0, 0, 1, 0],
    [0, 1, 0, 1, 1, 0, 0, 0, 0, 0],
    [1, 0, 0, 0, 0, 2, 1, 0, 0, 0],
    [1, 0, 0, 2, 1, 0, 0, 0, 0, 0]
]

teams = 10

wins = [0] * teams
draws = [0] * teams
losses = [0] * teams
goals_scored = [0] * teams
goals_conceded = [0] * teams

for i in range(teams):
    for j in range(teams):
        if i != j:
            if goals[i][j] > goals[j][i]:
                wins[i] += 1
            elif goals[i][j] < goals[j][i]:
                losses[i] += 1
            else:
                draws[i] += 1
            goals_scored[i] += goals[i][j]
            goals_conceded[i] += goals[j][i]

# Calculate goal difference and points obtained
goal_difference = [scored - conceded for scored, conceded in zip(goals_scored, goals_conceded)]
points = [3 * wins[i] + draws[i] for i in range(teams)]

# Show the statistics for each team
for i in range(teams):
    print(f"Team {i + 1}:")
    print(f"Wins: {wins[i]}")
    print(f"Draws: {draws[i]}")
    print(f"Losses: {losses[i]}")
    print(f"Goal Difference: {goal_difference[i]}")
    print(f"Points: {points[i]}")
    print()
