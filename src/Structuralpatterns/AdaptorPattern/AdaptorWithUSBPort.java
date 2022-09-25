package Structuralpatterns.AdaptorPattern;

public class AdaptorWithUSBPort extends CarWithCassetteTapesRadio {
    private  PersonWithUSB personWithUSB;

    public AdaptorWithUSBPort(CassetteTape cassetteTape) {
        super(cassetteTape);
    }

    @Override
    public void playMusic(USB USB) {
        USB currentPlaylist = personWithUSB.playlist();

        CassetteTape adaptor = userAdaptorToPlayUSBPlaylist(currentPlaylist);

        super.playMusic(adaptor);
    }

    private CassetteTape userAdaptorToPlayUSBPlaylist(USB playlist) {
        return new CassetteTape(playlist.getName());
    }
}
