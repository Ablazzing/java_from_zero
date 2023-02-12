package oop.class_object.clone;

public class Runner {
    public static void main(String[] args) throws CloneNotSupportedException {
        //Задача: написать метод создания 1000 клонов Агентов из матрицы
        Agent agent = new Agent("Мистер Смит");
        Agent[] agents = make1000Clones(agent);
        for (Agent clone : agents) {
            System.out.println(clone);
        }

    }

    //Здесь должен быть метод создания клонов
    public static Agent[] make1000Clones(Agent agent) throws CloneNotSupportedException {
        Agent[] agents = new Agent[1000];
        for (int i = 0; i < 1000; i++) {
            agents[i] = (Agent) agent.clone();
        }
        return agents;
    }
}
