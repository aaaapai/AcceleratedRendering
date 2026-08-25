package com.github.argon4w.acceleratedrendering.core.utils;

import com.mojang.blaze3d.systems.RenderSystem;
import org.lwjgl.opengl.GL;
import org.lwjgl.opengl.GL11;

public class AvailabilityUtils {

	private static boolean AVAILABILITY	= false;
	private static boolean CACHED		= false;

	public static boolean isAvailable() {
		if (CACHED) {
			return AVAILABILITY;
		}

		if (!RenderSystem.isOnRenderThreadOrInit()) {
			return false;
		}

		CACHED = true;

		return true;
	}
}
