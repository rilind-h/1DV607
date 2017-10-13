package view;

public interface langInterface {

    void startPageHeader();

    void addMemHeader();

    void selectMemHeader();

    void verboseListHeader();

    void compactListHeader();

    void loadRegHeader();

    void saveRegHeader();

    void savePathHeader();

    void memberMenuHeader(int id);

    void editMemberHeader(int id);

    void addBoatHeader();

    void editBoatHeader();

    void deleteBoatHeader();

    void memberInfoHeader(int id);

    void addConfirmation(String in);
    void deleteConfirmation(String in);
    void addBoatConfirmation(String in);
    void editBoatConfirmation(String in);
    void editBoatMessage(String old, String changed);
    void deleteBoatConfiramtion(String in);



    void errorMessage(int messageID);

    void outputMessage(int messageID);
}

