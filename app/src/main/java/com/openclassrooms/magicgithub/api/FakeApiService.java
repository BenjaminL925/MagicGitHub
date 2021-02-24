package com.openclassrooms.magicgithub.api;

import com.openclassrooms.magicgithub.model.User;
import com.openclassrooms.magicgithub.repository.UserRepository;
import com.openclassrooms.magicgithub.ui.user_list.ListUserActivity;

import java.nio.file.attribute.UserPrincipalLookupService;
import java.util.List;
import java.util.Random;

import static com.openclassrooms.magicgithub.api.FakeApiServiceGenerator.FAKE_USERS;
import static com.openclassrooms.magicgithub.api.FakeApiServiceGenerator.FAKE_USERS_RANDOM;
import static com.openclassrooms.magicgithub.api.FakeApiServiceGenerator.generateUsers;

public class FakeApiService implements ApiService {

    private List<User> users = generateUsers();

    /**
     * Return a list of {@link User}
     * Those users must be generated by {@link FakeApiServiceGenerator}
     */

    @Override
    public List<User> getUsers() {
        return users;

        // EXPLICATION = on as une liste user du nom de getuser qui est une fonction
        //  on renvoie liste d utilisateur avec

    }
    /**
     * Generate a random {@link User} and add it {@link FakeApiService#users} list.
     * This user must be get from the {@link FakeApiServiceGenerator#FAKE_USERS_RANDOM} list.
     */

    @Override
    public void generateRandomUser(){


      User random=User.random();

      /* la fonction random
        vient de user. java (ligne 28/29 )

       */

        users.add(random);

        //EXPLICATION= ajoute user a la fonction random

    }
    /**
     * delete a {@link User} from the {@link FakeApiService#users} list.
     */
    @Override

    public void deleteUser(User user) {

        users.remove(user);

        //EFFACE un user parmi la liste de user venant de FAKEAPISERVICE

    }


}
