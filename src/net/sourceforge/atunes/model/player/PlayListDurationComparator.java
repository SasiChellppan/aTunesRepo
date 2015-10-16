package net.sourceforge.atunes.model.player;

import java.util.Comparator;

import net.sourceforge.atunes.kernel.modules.repository.audio.AudioFile;

public class PlayListDurationComparator implements Comparator {

	public static PlayListDurationComparator comparator = new PlayListDurationComparator();

	public int compare(Object o1, Object o2) {
		AudioFile f1 = (AudioFile) o1;
		AudioFile f2 = (AudioFile) o2;
		Long f1Duration = new Long(f1.getDuration());
		Long f2Duration = new Long(f2.getDuration());

		return f1Duration.compareTo(f2Duration);
	}

}
