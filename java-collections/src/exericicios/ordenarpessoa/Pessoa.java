package exericicios.ordenarpessoa;

public class Pessoa implements Comparable<Pessoa>{
    private String name;
    private Integer age;
    private double height;

    public Pessoa(String name, Integer age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    @Override
    public int compareTo(Pessoa pessoa) {
        return this.age.compareTo(pessoa.getAge());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((age == null) ? 0 : age.hashCode());
        long temp;
        temp = Double.doubleToLongBits(height);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Pessoa other = (Pessoa) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (age == null) {
            if (other.age != null)
                return false;
        } else if (!age.equals(other.age))
            return false;
        if (Double.doubleToLongBits(height) != Double.doubleToLongBits(other.height))
            return false;
        return true;
    }

}
