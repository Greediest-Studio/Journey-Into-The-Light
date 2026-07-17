package net.journey.dialogue;

import net.minecraft.entity.player.EntityPlayerMP;

import java.util.HashMap;
import java.util.UUID;
//TODO add DialogueTracker serializing
public class DialogueManager {
	private final DialogueNetHandler netHandler = new DialogueNetHandler();
	private final HashMap<UUID, DialogueTracker> trackers = new HashMap<>();//FIXME move to map of lists of trackers

	public DialogueNetHandler getNetHandler() {
		return netHandler;
	}

	void handleDialogueChosenOption(EntityPlayerMP player, int optionIndex) throws DialogueSystemException {
		DialogueTracker dialogueTracker = trackers.get(player.getUniqueID());
		if (dialogueTracker == null) { // this can be achieved when someone try to use cheaty exploits
			throw new DialogueSystemException("There are no opened dialogues on server! What are you trying to do???");
		}

		dialogueTracker.pressOption(player, optionIndex);
	}

	void removeTracker(DialogueTracker tracker) {
		trackers.remove(tracker.getPlayerId());
	}
}
