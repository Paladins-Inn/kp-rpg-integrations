/*
 * Copyright (c) 2022 Kaiserpfalz EDV-Service, Roland T. Lichti.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */

package de.kaiserpfalzedv.rpg.integrations.drivethru.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import de.kaiserpfalzedv.rpg.integrations.drivethru.resource.DriveThruResource;
import lombok.*;
import lombok.extern.jackson.Jacksonized;
import org.eclipse.microprofile.openapi.annotations.media.Schema;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

@Jacksonized
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString
@EqualsAndHashCode
@Schema(name = "Publisher", description = "A publisher from DriveThruRPG.")
public class Publisher implements DriveThruResource {
    /**
     * the DriveThruRPG id.
     */
    @NotNull
    @Positive
    @JsonProperty("publishers_id")
    private String publisherId;

    /**
     * The DriveThruRPG name.
     */
    @NotNull
    @Size(min = 1, max = 1000)
    @JsonProperty("publishers_name")
    private String publisherName;
}
