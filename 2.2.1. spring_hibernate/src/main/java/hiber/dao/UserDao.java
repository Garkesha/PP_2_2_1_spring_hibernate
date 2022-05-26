package hiber.dao;

import hiber.model.User;

import java.util.List;

public interface UserDao {
   void add(User user);
   List<User> listUsers();
   User carOwgetUserByCarmodelAndSeriesner(String car_model, int car_series);
}
