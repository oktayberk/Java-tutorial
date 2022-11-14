public interface IEntityRepository <T extends IEntity> {// aşagıda sadece tipler degişiyor bu durumda <T> veriyoruz
    //T extends IEntity dedigimde sadecde customer ve productı ekleyebilmemizi saglar
    void add(T entity);
    void delete(T entity);
    void update(T entity);
}
