package com.mes;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.List;

public interface Music {
        List<String> getSong();
}
