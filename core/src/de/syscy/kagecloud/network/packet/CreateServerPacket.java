package de.syscy.kagecloud.network.packet;

import de.syscy.kagecloud.util.UUID;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class CreateServerPacket extends Packet {
	private @Getter UUID serverId;
	private @Getter String templateName;
	private @Getter String serverName;
}